public class Television {
    // Поля класса
    private int screenSize;
    private String brand;
    private boolean smartTV;
    private int channelNumber;
    // Номер включенного канала
    private int volume; // Громкость звука
    private boolean isOn; // Признак включенного телевизора

    // Конструктор
    public Television(int screenSize, String brand, boolean smartTV, int channelNumber, int volume, boolean isOn) {
        this.screenSize = screenSize;
        this.brand = brand;
        this.smartTV = smartTV;
        this.channelNumber = channelNumber;
        this.volume = volume;
        this.isOn = isOn;
    }

    // Getters
    public int getScreenSize() {
        return screenSize;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public int getChannelNumber() {
        return channelNumber;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isOn() {
        return isOn;
    }

    // Переопределенный метод toString
    @Override
    public String toString() {
        return "Телевизор: " + screenSize + " дюймов, бренд: " + brand + ", смарт ТВ: " + smartTV + ", канал: " + channelNumber + ", громкость: " + volume + ", включен: " + isOn;
    }

    // Методы equals и hashCode
    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Television)) {
            return false;
        }
        Television other = (Television) obj;
        return screenSize == other.screenSize && brand.equals(other.brand) && smartTV == other.smartTV && channelNumber == other.channelNumber && volume == other.volume && isOn == other.isOn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(screenSize, brand, smartTV, channelNumber, volume, isOn);
    }
}
