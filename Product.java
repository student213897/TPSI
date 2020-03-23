package Lab3;


public class Product {
    
    //id, name, price, category.
    private int id;
    private String name;
    private double price;
    private String category;
    
    Product(String _id, String _name, String _price, String _category){
        this.id = Integer.parseInt(_id);
        this.name = _name;
        this.price = Double.parseDouble(_price);
        this.category = _category;
    }
    public int getID(){        
        return this.id;
    }
    public String getCategory(){
        return this.category;
    }
}
