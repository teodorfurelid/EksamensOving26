public String desimalTilBinaer(int tallet) {
    // basistilfellet
    if (tallet == 0) {
        return "0";
    }

    Stack<Integer> stack = new Stack<>();

    while (tallet > 0) {
        stack.push(tallet % 2); // legg siffer på stack
        tallet = tallet / 2;
    }

    //Må hente ut av stacken og bygge svaret
    String svaret = "";
    while(!stack.isEmpty()) {
        svaret += stack.pop(); // henter fra stack og legger til svaret
    }

    return svaret;
}

