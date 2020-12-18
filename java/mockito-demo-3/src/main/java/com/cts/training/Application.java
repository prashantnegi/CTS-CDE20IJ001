package com.cts.training;

import com.cts.training.dao.BookDAOImpl;
import com.cts.training.model.Utils;

public class Application {

    public static void main(String[] args) {
        Utils utils = new Utils();
        utils.parseLibraryFrom(BookDAOImpl.DEFAULT_PATH).forEach(System.out::println);
    }
}
