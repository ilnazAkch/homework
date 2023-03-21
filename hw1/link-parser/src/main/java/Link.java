

class Link {
    protected Link next = null;

    public void setNext(Link parser) {
        this.next = parser;
    }

    public String parse(String url) {
        if (this.next != null) {
            return this.next.parse(url);
        }
        return null;
    }
}