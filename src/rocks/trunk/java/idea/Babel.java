package rocks.trunk.java.idea;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

/**
 * @author: 南山竹 <https://github.com/junjiemars>
 * @since 5/9/17.
 */
public final class Babel extends AnAction {

    public Babel() {
        super("Text _Boxes");
    }

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        String txt= Messages.showInputDialog(project,
                "What is your name?",
                "Input your name",
                Messages.getQuestionIcon());
        Messages.showMessageDialog(project,
                "Hello, " + txt + "!\n I am glad to see you.",
                "Information", Messages.getInformationIcon());
    }
}
