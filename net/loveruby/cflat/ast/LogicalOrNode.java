package net.loveruby.cflat.ast;
import net.loveruby.cflat.asm.Label;

public class LogicalOrNode extends BinaryOpNode {
    protected Label endLabel;

    public LogicalOrNode(ExprNode left, ExprNode right) {
        super(left, "||", right);
        this.endLabel = new Label();
    }

    public <S,E> E accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }

    public Label endLabel() {
        return endLabel;
    }
}
