class shriram {
public static void main(String[] args) {
String t = "Hii I am shriram.......";
int w = 100;
while (true) {
for (int i = 0; i < w; i++) {
System.out.print("\r" + " ".repeat(i) + t);
try {
Thread.sleep(200);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}
}
}

