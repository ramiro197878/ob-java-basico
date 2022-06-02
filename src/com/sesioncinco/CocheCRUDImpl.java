package com.sesioncinco;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Save desde implements");
    }

    @Override
    public void findAll() {
        System.out.println("findAll desde implements");

    }

    @Override
    public void delete() {
        System.out.println("Delete desde implements");
    }
}
