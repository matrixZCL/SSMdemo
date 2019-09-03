package main.dto;

import main.entity.Address;

import java.util.ArrayList;
import java.util.List;

public class AddressDTO {
    private List<Address> list=new ArrayList<>();

    public List<Address> getList() {
        return list;
    }

    public void setList(List<Address> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AddressDTO{" +
                "list=" + list +
                '}';
    }
}
