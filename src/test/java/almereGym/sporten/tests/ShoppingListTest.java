//package almereGym.sporten.tests;
//
//import almereGym.sporten.model.Product;
//import almereGym.sporten.model.Shopper;
//import almereGym.sporten.model.ShoppingList;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
///**
// * Unit test for simple App.
// */
//public class ShoppingListTest {
//    private Shopper p;
//    private ShoppingList il, al;
//
//    @BeforeEach
//    public void setup() {
//        p = new Shopper("Dum-Dum");
//        il = new ShoppingList("initialList", p);
//        al = new ShoppingList("anotherList", p);
//        p.addList(il);
//        p.addList(al);
//        il.addItem(new Product("Cola Zero"), 4);
//        il.addItem(new Product("Cola Zero"), 4);
//        il.addItem(new Product("Toiletpapier 6stk"), 1);
//        al.addItem(new Product("Paracetamol 30stk"), 3);
//    }
//
//    /**
//     * Rigorous Test :-)
//     */
//    @Test
//    public void listContainsTwoItems() {
//        assertEquals(2, il.getListItems().size());
//    }
//
//    @Test
//    public void listItemAddedTogether() {
//        assertEquals(8, il.getItem("Cola Zero").getAmount());
//    }
//
//
//}
