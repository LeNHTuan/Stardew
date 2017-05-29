/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUXX
 */
public class Room {

    int id, code;
    String name;

    public Room(int id, int code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }
    public Room() {
        this.id = 0;
        this.code = 0;
        this.name = "";
    }
    
    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", code=" + code + ", name=" + name + '}';
    }
    
}
