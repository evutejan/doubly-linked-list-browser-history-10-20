public class BrowserHistory {
    private Node current;

    public BrowserHistory() {
        current = null;
    }

    public void visit(String url){
        Node newNode = new Node(url);
        if (current == null) {
            current = newNode;
        }

        else {
            current.setNext(newNode);
            newNode.setPrev(current);
            current = newNode;
        }
    }

    public void back(){
        if (current == null || current.getPrev() == null) {
            System.out.println("No previous pages available");
        } else {
            current = current.getPrev();

        }

    }

    public void forward(){
        if (current == null || current.getNext() == null) {
            System.out.println("No forward pages available");
        } else {
            current = current.getNext();
        }
    }

    public String getCurrentPage(){
        if (current == null) {
            return "No page currently open";
        } else {
            return " Your current page " + current.toString();
        }
    }
}
