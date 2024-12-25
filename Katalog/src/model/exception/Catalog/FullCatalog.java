//todo здесь сама модель взаимодействия с пользователем.То-есть, компьютер выполняет все действия которые запросил пользователь.
package model.exception.Catalog;
import view.Product;

// Всё должно возвращаться
public class FullCatalog {
    public Product getTestProduct() {
        Product product = new Product("Корневой каталог", true);
        Product product1 = new Product("Азотные удобрения", true);
        Product product2 = new Product("Фосфорные удобрения", true);

        product.addProduct(product1);
        product.addProduct(product2);
        //поменять отображение продуктов
        product1.addProduct(new Product("- Амидные;", false));
        product1.addProduct(new Product("- Аммонийные;", false));// пусть будет выглядеть так: ..Азотные удобрения/Аммонийные
        product1.addProduct(new Product("- Нитратные;", false));

        product2.addProduct(new Product("- Фосфорная мука",false));
        product2.addProduct(new Product("- Простой суперфосфат",false));
        return product;
    }
}
//todo добавить проверку что есть такой катало, и что такого продукта в этом каталоге нету.

//    public static void main(String[] args) {
//        Product product = new Product("- Корневой каталог:", true);
//        Product product1 = new Product("-Азотные удобрения:", true);
//        Product product2 = new Product("-Фосфорные удобрения;", true);
//
//        product.addProduct(product1);
//        product.addProduct(product2);
//
//        product1.addProduct(new Product("- Амидные;", false));
//        product1.addProduct(new Product("- Аммонийные;", false));
//        product1.addProduct(new Product("- Нитратные;", false));
//
//        product.printProducts(0);
//        product1.printProducts(1);
//    }

//    public void removeProduct(String path) {


//        //todo перенести в консольview и прописать логику удаления из ерархии
//        System.out.print("Введите тип продукции, из которого хотите удалить продукт: ");
//        String productType = scanner.nextLine();
//
//        if (catalog.containsKey(productType) && !catalog.get(productType).isEmpty()) {
//            System.out.print("Введите название продукта для удаления: ");
//            String productName = scanner.nextLine();
//
//            if (catalog.get(productType).remove(productName)) {
//             System.out.println("Продукт " + productName + " удален из типа " + productType + ".");
//            }
//            else {
//                System.out.println("Продукт " + productName + " не найден в типе " + productType + ".");
//            }
//        }
//        else {
//            System.out.println("Такого типа продукции нет или он пуст.");
//        }



