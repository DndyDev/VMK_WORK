package ru.vmk.ServletCookiesSession.image;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "CaptchaImageServlet", value = "/CaptchaImageServlet")
public class CaptchaImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/png");
        String captcha = request.getParameter(Namespace.captcha);
        System.out.printf("captcha=%s\n", captcha);

        try (ServletOutputStream out = response.getOutputStream()) {
            ImageIO.write(CaptchaImageServlet.Captcha.generateCaptcha(captcha), "png", out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    /**
     * Servlet implementation class CaptchaServlet
     */
    public static class Captcha {
        private static int pixelPerChar = 35;
        private static int height = 80;


        public static BufferedImage generateCaptcha(String captcha) throws IOException {

            Random r = new Random();
            if (captcha == null) {
                captcha = Long.toString(Math.abs(r.nextLong()), 36).substring(0, 6);
            }
            int width = (int) (captcha.length() * pixelPerChar + pixelPerChar * 0.2);

            System.out.println(captcha);

            BufferedImage bufferedImage = new BufferedImage(width, height,
                    BufferedImage.TYPE_INT_RGB);

            Graphics2D g2d = bufferedImage.createGraphics();

            Font font = new Font("Georgia", Font.BOLD, 24);
            g2d.setFont(font);

            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);

            rh.put(RenderingHints.KEY_RENDERING,
                    RenderingHints.VALUE_RENDER_QUALITY);

            g2d.setRenderingHints(rh);

            GradientPaint gp = new GradientPaint(0, 0,
                    Color.getHSBColor(r.nextFloat() * 255, 0.8f, 1.0f), width / 2f, height / 2f, Color.black, true);

            g2d.setPaint(gp);
            g2d.fillRect(0, 0, width, height);

            g2d.setColor(new Color(255, 153, 0));
            int x = 0;
            int y;

            char[] arr = captcha.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                x += pixelPerChar * 0.8 + (Math.abs(r.nextInt()) % pixelPerChar * 0.1);
                y = (height / 3) + (Math.abs(r.nextInt()) % (height / 3));
                AffineTransform transform = g2d.getTransform();
                g2d.scale(
                        (r.nextDouble() + 2.5) / 3,
                        (r.nextDouble() + 1.5) / 2
                );
                g2d.drawLine(0, r.nextInt() % height, width, r.nextInt() % height);
                g2d.setColor(Color.getHSBColor(r.nextFloat() * 255, 0.8f, 0.9f));
                g2d.drawChars(arr, i, 1, x, y);
                g2d.setTransform(transform);

            }
            g2d.dispose();
            return bufferedImage;
        }
    }
}
