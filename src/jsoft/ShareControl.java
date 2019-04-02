package jsoft;

public interface ShareControl {

    //Cac chuc nang dieu khien chia se ket noi
    public ConnectionPool getCP();
    public void releaseCon();

}
