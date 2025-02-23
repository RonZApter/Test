public class Main
{
        public static void main(String[] args) {
            Furniture f = new OfficeChair();
            ((OfficeChair)f).raiseHeadrest();

            OfficeChair o = new OfficeChair();
            ((Furniture) o).cost();
        }
}

