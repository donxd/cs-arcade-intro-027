boolean variableName(String name) {
    return Pattern.matches( "^[a-zA-Z_][a-zA-Z_0-9]*$", name );
}