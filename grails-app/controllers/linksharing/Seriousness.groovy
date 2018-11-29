package linksharing

enum Seriousness{SERIOUS("SERIOUS"), CASUAL("CASUAL"), VERY_SERIOUS("VERY_SERIOUS")
    String value

    Seriousness(String value) {
        this.value = value
    }
}
