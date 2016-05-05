/**
 * @brief
 * Created by Эрдынеев М.Ц. on 21.04.2016.
 * Entity class for user
 *
 * */
public class User {
    private String name;
    private String surname;
    private String age;
    private String isTeacher;
    private String isAdmin;
    private String login;
    private String email;

    /**
     * @brief
     * получить коннект к базе
     * @return connectionObject
     * @throws Exception - db exception
     */
    public String getDbConnection() throws Exception {

        return "connectionObjectdsadsa";
    }

    /**
     * @brief
     * Получить пароль
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @brief
     * задать пароль
     * @param password пароль
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @brief
     * получить email
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @brief
     * задать почтовый адрес
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @brief
     * получить логин
     * @return login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @brief
     * задать логин
     * @param login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @brief
     *  проверка на администратора
     * @return
     */
    public String getIsAdmin() {
        return isAdmin;
    }

    /**
     * @brief
     * сделать администратором
     * @param isAdmin
     */
    public void setIsAdmin(String isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * @brief
     * проверка - Учитель ли
     * @return isTeacher
     */
    public String getIsTeacher() {
        return isTeacher;
    }

    private String password;

    /**
     * @brief
     * Конструктор объекта user
     * @param name
     * @param surname
     * @param age
     * @param isTeacher
     * @param isAdmin
     * @param login
     * @param email
     * @param password
     */
    public User(String name, String surname, String age, String isTeacher, String isAdmin, String login, String email, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isTeacher = isTeacher;
        this.isAdmin = isAdmin;
        this.login = login;
        this.email = email;
        this.password = password;
    }
}
