package net.loveruby.cflat.ast;
import net.loveruby.cflat.asm.Label;

public class ContinueNode extends StmtNode {
    public ContinueNode(Location loc) {
        super(loc);
    }

    protected Label label;

    public void setTargetLabel(Label label) {
        this.label = label;
    }

    public Label targetLabel() {
        if (label == null) {
            throw new Error("continue target label is null");
        }
        return label;
    }

    protected void _dump(Dumper d) {
    }

    public <S,E> S accept(ASTVisitor<S,E> visitor) {
        return visitor.visit(this);
    }
}
