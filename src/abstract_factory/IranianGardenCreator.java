package abstract_factory;

public class IranianGardenCreator implements GardenCreator{
    private Tree tree;
    private Flower flower;

    @Override
    public void createTree() {
        this.tree = new Chenar();
    }

    @Override
    public void createFlower() {
        this.flower = new Khatmi();
    }

    @Override
    public FlowerType getFlowerType() {
        if(this.flower != null) {
            return this.flower.getFlowerType();
        } else {
            return null;
        }
    }

    @Override
    public TreeType getTreeType() {
        if(this.tree != null) {
            return this.tree.getTreeType();
        } else {
            return null;
        }
    }

    public Tree getTree() {
        return tree;
    }

    public Flower getFlower() {
        return flower;
    }
}
