package sınav;

interface Plugin {
    void load();
}

class Image implements Plugin {
    public void load() {
        System.out.println("Image yükleniyo");
    }
}

class Document implements Plugin {
    public void load() {
        System.out.println("Document  yükleniyo");
    }
}
