package cviceni2;

public class Backpack {
    private final int volume,loadCapacity;
    public int remainingVolume, remainingLoadCapacity;

    public Backpack(int volume, int loadCapacity) {
        this.volume = remainingVolume = volume;
        this.loadCapacity = remainingLoadCapacity = loadCapacity;
    }

    public boolean putItem(Item item){
        if(item == null) return false; //kdyby byl item nullptr

        int itemWeight = item.getWeight();
        int itemVolume = item.getVolume();

        if(remainingVolume >= itemVolume && remainingLoadCapacity >= itemWeight){
            remainingVolume -= itemVolume;
            remainingLoadCapacity -= itemWeight;
            return true;
        }
        return false;
    }

    public int getVolume() {
        return volume;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getRemainingVolume() {
        return remainingVolume;
    }

    public int getRemainingLoadCapacity() {
        return remainingLoadCapacity;
    }
}
