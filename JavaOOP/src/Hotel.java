/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LUXX
 */
public class Hotel {

    int capacity = 10, roomOcc = 0;
    Room res[] = new Room[10];

    public Hotel() {
        for (int i = 0; i < 10; i++) {
            res[i] = new Room();
        }
    }

    public Room[] readAll() {
        return res;
    }
}
