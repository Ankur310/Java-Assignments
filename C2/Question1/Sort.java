package Question1;

class Sort implements BubbleSort, SelectionSort,Another_SortAlgo {

     @Override
     public void AnotherAlgo() {
          System.out.println("Array sorted using Another_Algo");
     }

     @Override
     public void bubbleSort() {
          System.out.println("Array sorted using BubbleSort");
     }

     @Override
     public void selectionSort() {
          System.out.println("Array sorted using SelectionSort");
     }
}
