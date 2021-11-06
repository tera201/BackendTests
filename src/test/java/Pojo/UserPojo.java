package Pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserPojo {
    /** Поле id */
    private Long id;
    /** Поле username */
    private String username;
    /** Поле имя */
    private String firstName;
    /** Поле фамилия */
    private String lastName;
    /** Поле email */
    private String email;
    /** Поле пароль */
    private String password;
    /** Поле телефон */
    private String phone;
    /** Поле статус */
    private Long userStatus;

    /**
     * Функция получения значения поля {@link UserPojo#id}
     * @return возвращает id пользователя
     */
    public Long getId() {
        return id;
    }

    /**
     * Функция определения id {@link UserPojo#id}
     * @return объект UserPojo
     */
    public UserPojo setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#id}
     * @return возвращает id пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Функция определения username {@link UserPojo#username}
     * @return объект UserPojo
     */
    public UserPojo setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#firstName}
     * @return возвращает Имя пользователя
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Функция определения имени {@link UserPojo#firstName}
     * @return объект UserPojo
     */
    public UserPojo setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#lastName}
     * @return возвращает Фамилию пользователя
     */
    public String getLastName() {
        return lastName;
    }


    /**
     * Функция определения фамилии {@link UserPojo#lastName}
     * @return объект UserPojo
     */
    public UserPojo setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#email}
     * @return возвращает email пользователя
     */
    public String getEmail() {
        return email;
    }


    /**
     * Функция определения email {@link UserPojo#email}
     * @return объект UserPojo
     */
    public UserPojo setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#password}
     * @return возвращает пароль пользователя
     */
    public String getPassword() {
        return password;
    }


    /**
     * Функция определения пароля {@link UserPojo#password}
     * @return объект UserPojo
     */
    public UserPojo setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#phone}
     * @return возвращает телефон пользователя
     */
    public String getPhone() {
        return phone;
    }


    /**
     * Функция определения телефона {@link UserPojo#phone}
     * @return объект UserPojo
     */
    public UserPojo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Функция получения значения поля {@link UserPojo#userStatus}
     * @return возвращает статус пользователя
     */
    public Long getUserStatus() {
        return userStatus;
    }


    /**
     * Функция определения статуса {@link UserPojo#userStatus}
     * @return объект UserPojo
     */
    public UserPojo setUserStatus(Long userStatus) {
        this.userStatus = userStatus;
        return this;
    }
}
