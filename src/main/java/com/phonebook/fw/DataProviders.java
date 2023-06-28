package com.phonebook.fw;

import com.phonebook.model.Contact;
import org.checkerframework.framework.qual.DefaultQualifier;
import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> addContactFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader
                (new File("src/test/resources/contact.csv")));
        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Contact().setName(split[0]).setLastname(split[1]).setPhone(split[2])
                    .setEmail(split[3]).setAddress(split[4]).setDesc(split[5])});
            line = reader.readLine();
        }
        return list.iterator();

    }

    @DataProvider
    public Iterator<Object[]> addNegativeContactFromCsvFile() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader
                (new File("src/test/resources/negativContact.csv")));
        String line = reader.readLine();

        while (line != null) {
            String[] split = line.split(",");
            list.add(new Object[]{new Contact().setName(split[0]).setLastname(split[1]).setPhone(split[2])
                    .setEmail(split[3]).setAddress(split[4]).setDesc(split[5])});
            line = reader.readLine();
        }
        return list.iterator();
    }
}
/*Homework
В классе DataProviders создайте, пожалуйста, еще один метод с аннотацией @DataProvider,
который будет работать с табличкой
В тестовом методе AddContactTests создайте, пожалуйсчта, еще один тестовый метод, который будет проверять
реакцию аппликации на добавление контакта с неверными телефонными номерами
Для запуска негативных тестов создайте, пожалуйста, специальный пакет в файле .xml*/