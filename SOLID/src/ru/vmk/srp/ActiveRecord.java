// создание пользователя
Accounts account = new Accounts();
account.AddNew();
account.Name = "Sergey";
account.Save();
// Загрузка обьекта по ID
 Accounts account = new Accounts();
 account.LoadByPrimaryKey(1);
// загрузка связанной коллекции при обращении к свойству объекта
 ArrayList <Accounts> list = accounts.Roles;

<text>В данном случае объект Account имеет несколько ответственностей:

 является объектом домена и хранит бизнес-правила, например,
 связь с коллекцией ролей является точкой доступа к базе данных

Простым и действенным выходом является использование шаблона Repository.
Хранилищу AccountRepository мы оставляем работу с базой данных
и получаем «чистый» доменный объект. </text>

 // создание пользователя
 var account = new Account();
 account.Name = "Name";
 accountRepository.Save(account);

 // загрузка пользователя по Id
 var account = accountRepository.GetById(1);

 // загрузка со связной коллекцией
 // пример из LLBLGen Pro
 var account = accountRepository.GetById(1, new IPath[]{new Path<Account>(Account.PrefetchPathRoles)});
