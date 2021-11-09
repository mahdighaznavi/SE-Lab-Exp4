package abstract_factory_test;

import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {
    @Test
    public void iranian_garden_test() {
        IranianGardenCreator iranianGardenCreator = new IranianGardenCreator();
        Client client = new Client(iranianGardenCreator);
        client.plantTree();
        client.plantFlower();
        Assert.assertEquals(FlowerType.Khatmi, client.getFlowerType());
        Assert.assertEquals(TreeType.Chenar, client.getTreeType());
    }
}
