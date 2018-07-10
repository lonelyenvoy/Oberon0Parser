// This file is used only to show the grammar of Oberon-0.
// It does NOT compile.

%%

Module                  =   "MODULE" {Identifier} ";" {Declarations}
                            ("BEGIN" {StatementSequence})?
                            "END" {Identifier} "."
Declarations            =   ("CONST" ({Identifier} "=" {Expression} ";")*)?
                            ("TYPE" ({Identifier} "=" {Type} ";")*)?
                            ("VAR" ({IdentifierList} ":" {Type} ";")*)?
                            ({ProcedureDeclaration} ";")*
ProcedureDeclaration    =   {ProcedureHeading} ";" {ProcedureBody}
ProcedureBody           =   {Declarations}
                            ("BEGIN" {StatementSequence})?
                            "END" {Identifier}
ProcedureHeading        =   "PROCEDURE" {Identifier} {FormalParameters}?
FormalParameters        =   "(" ({FpSection} (";" {FpSection})*)? ")"
FpSection               =   "VAR"? {IdentifierList} ":" {Type}
Type                    =   {Identifier} | {ArrayType} | {RecordType}
RecordType              =   "RECORD" {FieldList} (";" {FieldList})* "END"
FieldList               =   ({IdentifierList} ":" {Type})?
ArrayType               =   "ARRAY" {Expression} "OF" {Type}
IdentifierList          =   {Identifier} ("," {Identifier})*
StatementSequence       =   {Statement} (";" {Statement})*
Statement               =   ( {Assignment} | {ProcedureCall} | {IfStatement} | {WhileStatement} )?
WhileStatement          =   "WHILE" {Expression} "DO" {StatementSequence} "END"
IfStatement             =   "IF" {Expression} "THEN" {StatementSequence}
                            ("ELSIF" {Expression} "THEN" {StatementSequence})*
                            ("ELSE" {StatementSequence})?
                            "END"
ProcedureCall           =   {Identifier} {ActualParameters}?
ActualParameters        =   "(" ({Expression} ("," {Expression})*)? ")"
Assignment              =   {Identifier} {Selector} ":=" {Expression}
Expression              =   {SimpleExpression} (("=" | "#" | "<" | "<=" | ">" | ">=") {SimpleExpression})?
SimpleExpression        =   ("+" | "-")? {Term} (("+" | "-" | "OR") {Term})*
Term                    =   {Factor} ( ("*" | "DIV" | "MOD" | "&") {Factor} )*
Factor                  =   {Identifier} {Selector} | {Number} | "(" {Expression} ")" | "~" {Factor}
Number                  =   {Integer}
Selector                =   ("." {Identifier} | "[" {Expression} "]")*

Integer                 =   {Digit} {Digit}*
Identifier              =   {Letter} ({Letter} | {Digit})*

Letter                  =   [A-Za-z]
Digit                   =   [0-9]

%%

{Module} {}
