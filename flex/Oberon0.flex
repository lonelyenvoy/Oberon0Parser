package grammar;

import exception.lexer.LexerException;
import exception.lexer.IllegalSymbolException;
import exception.lexer.UnmatchedSymbolException;

import java_cup.runtime.Symbol;

%%

%class Lexer
%type Symbol
%yylexthrow LexerException
%ignorecase
%char
%line
%column

%{
    public Symbol token(int tokenType) {
        return new Symbol(tokenType, yychar, yychar + yytext().length(), yytext());
    }
    public boolean atEOF() {
        return this.zzAtEOF;
    }
    public int yyline() {
        return this.yyline;
    }
    public int yycolumn() {
        return this.yycolumn;
    }
    public int normalizedYyline() {
        return this.yyline + 1;
    }
    public int normalizedYycolumn() {
        return this.yycolumn + 1;
    }
%}

// keywords
Module                  =   "MODULE"
Begin                   =   "BEGIN"
End                     =   "END"
Const                   =   "CONST"
Type                    =   "TYPE"
Var                     =   "VAR"
Procedure               =   "PROCEDURE"
Array                   =   "ARRAY"
Of                      =   "OF"
Record                  =   "RECORD"
While                   =   "WHILE"
Do                      =   "DO"
If                      =   "IF"
Then                    =   "THEN"
ElsIf                   =   "ELSIF"
Else                    =   "ELSE"

// separators
Semicolon               =   ";"
Comma                   =   ","

// arithmetic operators
Add                     =   "+"
Subtract                =   "-"
Multiply                =   "*"
Divide                  =   "DIV"
Mod                     =   "MOD"

// logic operators
And                     =   "&"
Or                      =   "OR"
Not                     =   "~"

// comparison operators
Equal                   =   "="
NotEqual                =   "#"
Less                    =   "<"
LessOrEqual             =   "<="
Greater                 =   ">"
GreaterOrEqual          =   ">="

// selector operators
LeftSquareBracket       =   "["
RightSquareBracket      =   "]"

// assignment operators
Assign                  =   ":="

// other operators
LeftRoundBracket        =   "("
RightRoundBracket       =   ")"
Dot                     =   "."
Colon                   =   ":"

// generals
Operator                =   {ArithmeticOperator}
                        |   {LogicOperator}
                        |   {ComparisonOperator}
                        |   {SelectorOperator}
                        |   {AssignmentOperator}
                        |   {LeftRoundBracket} | {RightRoundBracket}
                        |   {Dot}
                        |   {Colon}
ArithmeticOperator      =   {Add} | {Subtract} | {Multiply} | {Divide} | {Mod}
LogicOperator           =   {And} | {Or} | {Not}
ComparisonOperator      =   {Equal} | {NotEqual} | {Less} | {LessOrEqual} | {Greater} | {GreaterOrEqual}
SelectorOperator        =   {LeftSquareBracket} | {RightSquareBracket}
AssignmentOperator      =   {Assign}
Newline                 =   \r|\n|\r\n
WhiteSpace              =   [ \t\b] | {Newline}
Comment                 =   "(*" [^*] ~"*)" | "(*" "*"+ ")"
Identifier              =   {Letter}({Letter}|{Digit})*
DecimalInteger          =   {NonZeroDigit}{Digit}*
OctalInteger            =   {Zero}{NonZeroOctalDigit}{OctalDigit}*
Integer                 =   {Zero} | {DecimalInteger} | {OctalInteger}
Letter                  =   [:jletter:]
Digit                   =   [0-9]
NonZeroDigit            =   [1-9]
OctalDigit              =   [0-7]
NonZeroOctalDigit       =   [1-7]
NonOctalDigit           =   [8-9]
Zero                    =   0

// illegals
IllegalIdentifier       =   {Digit}+{Letter}+
IllegalOctalInteger     =   {Zero}{OctalDigit}*{NonOctalDigit}+{OctalDigit}*

%%

<YYINITIAL> {
    {Newline}               { /* Ignore */ }
    {WhiteSpace}            { /* Ignore */ }
    {Comment}               { /* Ignore */ }
    {Module}                { return token(SymbolConstants.MODULE); }
    {Begin}                 { return token(SymbolConstants.BEGIN); }
    {End}                   { return token(SymbolConstants.END); }
    {Const}                 { return token(SymbolConstants.CONST); }
    {Type}                  { return token(SymbolConstants.TYPE); }
    {Var}                   { return token(SymbolConstants.VAR); }
    {Procedure}             { return token(SymbolConstants.PROCEDURE); }
    {Array}                 { return token(SymbolConstants.ARRAY); }
    {Of}                    { return token(SymbolConstants.OF); }
    {Record}                { return token(SymbolConstants.RECORD); }
    {While}                 { return token(SymbolConstants.WHILE); }
    {Do}                    { return token(SymbolConstants.DO); }
    {If}                    { return token(SymbolConstants.IF); }
    {Then}                  { return token(SymbolConstants.THEN); }
    {ElsIf}                 { return token(SymbolConstants.ELSIF); }
    {Else}                  { return token(SymbolConstants.ELSE); }
    {Semicolon}             { return token(SymbolConstants.SEMICOLON); }
    {Comma}                 { return token(SymbolConstants.COMMA); }
    {Add}                   { return token(SymbolConstants.ADD); }
    {Subtract}              { return token(SymbolConstants.SUBTRACT); }
    {Multiply}              { return token(SymbolConstants.MULTIPLY); }
    {Divide}                { return token(SymbolConstants.DIVIDE); }
    {Mod}                   { return token(SymbolConstants.MOD); }
    {And}                   { return token(SymbolConstants.AND); }
    {Or}                    { return token(SymbolConstants.OR); }
    {Not}                   { return token(SymbolConstants.NOT); }
    {Equal}                 { return token(SymbolConstants.EQUAL); }
    {NotEqual}              { return token(SymbolConstants.NOT_EQUAL); }
    {Less}                  { return token(SymbolConstants.LESS); }
    {LessOrEqual}           { return token(SymbolConstants.LESS_OR_EQUAL); }
    {Greater}               { return token(SymbolConstants.GREATER); }
    {GreaterOrEqual}        { return token(SymbolConstants.GREATER_OR_EQUAL); }
    {LeftSquareBracket}     { return token(SymbolConstants.LEFT_SQUARE_BRACKET); }
    {RightSquareBracket}    { return token(SymbolConstants.RIGHT_SQUARE_BRACKET); }
    {Assign}                { return token(SymbolConstants.ASSIGN); }
    {LeftRoundBracket}      { return token(SymbolConstants.LEFT_ROUND_BRACKET); }
    {RightRoundBracket}     { return token(SymbolConstants.RIGHT_ROUND_BRACKET); }
    {Dot}                   { return token(SymbolConstants.DOT); }
    {Colon}                 { return token(SymbolConstants.COLON); }
    {Identifier}            {
                              if (yytext().length() > 24) throw new IllegalSymbolException("Identifier too long");
                              return token(SymbolConstants.IDENTIFIER);
                            }
    {Integer}               {
                              if (yytext().length() > 12) throw new IllegalSymbolException("Integer too long");
                              return token(SymbolConstants.INTEGER);
                            }
    {IllegalIdentifier}     {
                              throw new IllegalSymbolException("Illegal identifier");
                            }
    {IllegalOctalInteger}   {
                              throw new IllegalSymbolException("Illegal octal integer");
                            }
    .                       {
                              throw new UnmatchedSymbolException();
                            }
}
