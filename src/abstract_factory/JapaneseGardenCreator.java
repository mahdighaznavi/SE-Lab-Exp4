package abstract_factory;

public class JapaneseGardenCreator implements GardenCreator {
    private Tree tree;
    private Flower flower;

    public Tree getTree() {
        return tree;
    }

    public Flower getFlower() {
        return flower;
    }

    @Override
    public FlowerType getFlowerType() {
        if (this.flower != null) {
            return this.flower.getFlowerType();
        } else {
            return null;
        }
    }

    @Override
    public TreeType getTreeType() {
        if (this.tree != null) {
            return this.tree.getTreeType();
        } else {
            return null;
        }
    }

    @Override
    public void createTree() {
        this.tree = new Lilac();
    }

    @Override
    public void createFlower() {
        this.flower = new Tsubaki();
    }
}
