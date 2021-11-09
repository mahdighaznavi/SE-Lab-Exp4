package abstract_factory;

public interface GardenCreator {
    void createTree();

    void createFlower();
    FlowerType getFlowerType();
    TreeType getTreeType();
}
