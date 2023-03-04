package com.hunterparcells.csi2310.work.project2;

public class StackWork {
   private int[] S0;
   private int S0top;
   private int S0length;

   private int[] S1;
   private int S1top;
   private int S1length;

   private int[] S2;
   private int S2top;
   private int S2length;

   // Precondition: S0size, S1size, and S2size are greater than 0.
   // Postcondition: The stacks S0, S1, and S2, are created, and their respective lengths are initialized.
   public StackWork(int S0size, int S1size, int S2size) {
      S0length = S0size;
      S0 = new int[S0size];
      S0top = 0;
      S1length = S1size;
      S1 = new int[S1size];
      S1top = 0;
      S2length = S2size;
      S2 = new int[S2size];
      S2top = 0;
   }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then the new element x is inserted in stack S0. If StackSelector is 1,
   // then the new element x is inserted in stack S1. If StackSelector is 2, then the new element x is inserted
   // in stack S2.
   public void Push(int x, int StackSelector) {
      // Implement me.
      if(StackSelector == 0) {
         if(S0top >= S0length) {
            throw new StackOverflowError("S0 Overflowed");
         }
         S0[S0top] = x;
         S0top++;
      }else if(StackSelector == 1) {
         if(S1top >= S1length) {
            throw new StackOverflowError("S1 Overflowed");
         }
         S1[S1top] = x;
         S1top++;
      }else if(StackSelector == 2) {
         if(S2top >= S2length) {
            throw new StackOverflowError("S2 Overflowed");
         }
         S2[S2top] = x;
         S2top++;
      }else {
         throw new Error("Invalid value passed to StackSelector: " + StackSelector);
      }
   }

   // Precondition: StackSelector is equal to 0, 1, or 2.
   // Postcondition: If StackSelector is 0, then an element is taken out of stack S0 and is returned to the caller.
   // If StackSelector is 1, then an element is taken out of stack S1 and is returned to the caller.
   // If StackSelector is 2, then an element is taken out of stack S2 and is returned to the caller.
   public int Pop(int StackSelector) {
      // literally just implement stack once, and instantiate THREE of them!!!
      if(StackSelector == 0) {
         if(S0top == 0) {
            throw new Error("S0 Underflowed");
         }
         S0top--;
         return S0[S0top];
      }else if(StackSelector == 1) {
         if(S1top == 0) {
            throw new Error("S1 Underflowed");
         }
         S1top--;
         return S1[S1top];
      }else if(StackSelector == 2) {
         if(S2top == 0) {
            throw new Error("S2 Underflowed");
         }
         S2top--;
         return S2[S2top];
      }else {
         throw new Error("Invalid value passed to StackSelector: " + StackSelector);
      }
   }

   // Precondition:
   // Postcondition: The elements of the stack S0 are displayed, followed by the elements of the stack S1, and in the end
   // the elements of the Stack S2.
   public void displayStackData() {
      displaySingleStack("S0", S0, S0top);
      displaySingleStack("S1", S1, S1top);
      displaySingleStack("S2", S2, S2top);
   }

   private static void displaySingleStack(String stackName, int[] stack, int top) {
      System.out.println("Data in " + stackName + ":");
      if(top != 0) {
         System.out.print(stack[0]);
         for(int i = 1; i < top; i++) {
            System.out.print(" " + stack[i]);
         }
         System.out.println();
      }
   }

   // Precondition: The StackWork object exists.
   // Postcondition: The instance variable S0top is returned.
   public int getS0top() {
      return S0top;
   }
}	
