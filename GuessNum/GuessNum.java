
class GuessNum {
    int targetNumber;
    int attempts;
    boolean guessCorrect;

    public GuessNum(int targetNumber) {
        this.targetNumber = targetNumber;
        this.attempts = 0;
        this.guessCorrect = false;
    }

    public void startGame() throws Exception {
        System.out.println("1 ile 100 arasında bir sayı tahmin edin.");

        while (!guessCorrect) {
            System.out.print("Tahminini gir: ");
            int guess = 0;
            int c;
            boolean validInput = true;
            
            // Girdi sadece sayılar olacak ve 'Enter' ile girişi sonlandırdık 
            while ((c = System.in.read()) != '\n') {
                if (c >= '0' && c <= '9') {
                    guess = guess * 10 + (c - '0');
                } else {
                    validInput = false;
                }
            }
            
            if (!validInput) {
                System.out.println("Sadece sayı kullanın!");
                continue;
            }

            attempts++;

            if (guess == targetNumber) {
                System.out.println("Afferinn toplam " + attempts + " tahminde bildin");
                guessCorrect = true;
            } else if (guess > targetNumber) {
                System.out.println("Çok büyük tahmin ettin! daha küçük bir sayı dene");
            } else {
                System.out.println("Çok küçük tahmin ettin! daha büyük bir sayı dene");
            }
        }
    }
}
