package type;

import type.base.Normative;

public enum Operator implements Normative {
    ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE,
    MOD,
    AND,
    OR,
    NOT,
    EQUAL,
    NOT_EQUAL,
    LESS,
    LESS_OR_EQUAL,
    GREATER,
    GREATER_OR_EQUAL,
    NONE;

    @Override
    public String toString() {
        switch (this) {
            case ADD:               return "+";
            case SUBTRACT:          return "-";
            case MULTIPLY:          return "*";
            case DIVIDE:            return "DIV";
            case MOD:               return "MOD";
            case AND:               return "&";
            case OR:                return "OR";
            case NOT:               return "~";
            case EQUAL:             return "=";
            case NOT_EQUAL:         return "#";
            case LESS:              return "<";
            case LESS_OR_EQUAL:     return "<=";
            case GREATER:           return ">";
            case GREATER_OR_EQUAL:  return ">=";
            case NONE:              return "";
            default:                throw new RuntimeException("Unrecognized operator");
        }
    }

    @Override
    public String toNormativeString() {
        switch (this) {
            case ADD:               return "+";
            case SUBTRACT:          return "-";
            case MULTIPLY:          return "*";
            case DIVIDE:            return "DIV";
            case MOD:               return "MOD";
            case AND:               return "&";
            case OR:                return "OR";
            case NOT:               return "~";
            case EQUAL:             return "=";
            case NOT_EQUAL:         return "#";
            case LESS:              return "&lt";
            case LESS_OR_EQUAL:     return "&lt=";
            case GREATER:           return "&gt";
            case GREATER_OR_EQUAL:  return "&gt=";
            case NONE:              return "";
            default:                throw new RuntimeException("Unrecognized operator");
        }
    }
}
