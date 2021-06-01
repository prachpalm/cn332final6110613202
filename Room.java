public interface Room {
    void book();
    double getPrice();
    boolean getWifi();
    void setWifi(boolean newWifi);
    String getStart();
    void setStart(String newStart);
    String getEnd();
    void setEnd(String newEnd);
    int getNumPeople();
    void setNumPeople(int newNumPeople);
    void promotionDiscount(Promotion promotion);
}
