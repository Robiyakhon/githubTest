 public class Tree {
    /*
     Project: Tree
     Author: Robiiakhon Kuchkorova
     Date: 1/29/25
     */
        private String color;
        private double height;
        private int age;
    
        //method to set all three values
        public Tree(String c, double h, int a){
            this.color = c;
            this.height = h;
            this.age = a;
        }
    
        public String getColor(){
            return this.color;
        }
    
        //method for height
        public double getHeight(){
            return this.height;
        }
    
        //method for age
        public int getAge(){
            return this.age;
        }
    
        public void printTreeDetails(String treeName) { //also we can do with int a
    
            System.out.println(treeName + ": "); // ("tree" + a + " :");
            System.out.println("Color of the tree is " + getColor());
            System.out.println("Height of the tree is " + getHeight());
            System.out.println("Age of the tree is " + getAge());
            System.out.println();
        }
        
    }