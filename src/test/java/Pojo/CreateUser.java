package Pojo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class CreateUser {
    /**
     * метод заполнения POJO из Json
     * @param f объект файл содержааащий путь с файлом json {@link File}
     * @return объект {@link UserPojo}
     */
    public static UserPojo fromJson(File f){
        ObjectMapper mapper = new ObjectMapper();
        UserPojo user = null;
        try {
            user = mapper.readValue(f, UserPojo.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;
    }
}
