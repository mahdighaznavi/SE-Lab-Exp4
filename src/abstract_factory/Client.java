package abstract_factory;

public class Client {
    final private GardenCreator gardenCreator;

    public Client(GardenCreator gardenCreator) {
        this.gardenCreator = gardenCreator;
    }

    public void plantTree() {
        this.gardenCreator.createTree();
    }

    public void plantFlower() {
        this.gardenCreator.createFlower();
    }

    public FlowerType getFlowerType() {
        return gardenCreator.getFlowerType();
    }

    public TreeType getTreeType() {
        return gardenCreator.getTreeType();
    }
}
