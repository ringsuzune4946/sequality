package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double ave(int x, int y) {
    return ((double) x + (double) y) / 2;
  }

  public int toSum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public double toAve(int x, int y) {
    int sum = 0;
    int n = 0;
    for (int i = x; i <= y; i++) {
      sum += i;
      n++;
    }
    return (double) sum / n;
  }

  public int oddToSum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (checkOdd(i))
        sum += i;
    }
    return sum;
  }

  public int evenToSum(int x, int y) {
    int sum = 0;
    for (int i = x; i <= y; i++) {
      if (!checkOdd(i))
        sum += i;
    }
    return sum;
  }

  public boolean checkOdd(int x) {
    if (x % 2 == 1)
      return true;
    else
      return false;
  }
}
