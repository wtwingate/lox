package dev.mallard.lox;

/**
 * This class provides the basic data structure used by the Scanner to
 * process source code into distinct lexical units.
 */
class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;

    Token(TokenType type, String lexeme, Object literal, int line) {
	this.type = type;
	this.lexeme = lexeme;
	this.literal = literal;
	this.line = line;
    }

    public String toString() {
	return type + " " + lexeme + " " + literal;
    }
}
