package ru.vmk;

import net.sf.cglib.core.DefaultNamingPolicy;
import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.Factory;
import org.objenesis.Objenesis;
import org.objenesis.ObjenesisStd;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NotADuck {
    /**
            * The unique callback index to which each method in the proxy object is mapped.
            */
    private static final int CALLBACK_INDEX = 0;

    /**
     * Maps all methods to index {@link #CALLBACK_INDEX}.
     */
    private static final CallbackFilter ZERO_CALLBACK_FILTER = method -> CALLBACK_INDEX;

    // with caching
    private static final Objenesis OBJENESIS = new ObjenesisStd(true);

    public static <T> T asDuck(Object notADuck, Class<T> type) {
        final Enhancer enhancer = new Enhancer();
        final InvocationHandler invocationHandler = new DelegateDuckToNonDuckMethod(notADuck);

        enhancer.setSuperclass(type);
        enhancer.setUseFactory(true);
        enhancer.setNamingPolicy(new DefaultNamingPolicy());
        enhancer.setCallbackFilter(ZERO_CALLBACK_FILTER);
        enhancer.setCallbackType(invocationHandler.getClass());

        final Class<T> proxyClass = enhancer.createClass();
        final T duckInstance = OBJENESIS.getInstantiatorOf(proxyClass).newInstance();
        final Factory factory = (Factory) duckInstance;
        factory.setCallback(CALLBACK_INDEX, (Callback) invocationHandler);
        return duckInstance;
    }

    private static class DelegateDuckToNonDuckMethod implements InvocationHandler {

        private final Object notADuck;

        private DelegateDuckToNonDuckMethod(Object notADuck) {
            this.notADuck = notADuck;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            final Method nonDuckMethod = notADuck.getClass().getMethod(method.getName(), method.getParameterTypes());
            return nonDuckMethod.invoke(notADuck, args);
        }
    }
}
