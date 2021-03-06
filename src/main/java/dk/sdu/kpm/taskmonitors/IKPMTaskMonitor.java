package dk.sdu.kpm.taskmonitors;

/**
 * Created by: Martin
 * Date: 17-02-14
 */
public interface IKPMTaskMonitor {
    /**
     * Sets the title of the <code>Task</code>.
     * The title is a succinct description of the <code>Task</code>'s
     * purpose. This method should only be called once and at the beginning
     * of the <code>run</code> method.
     * @param title Succinct description of the Task's purpose.
     */
    public void setTitle(String title);

    /**
     * Sets the progress completed by the <code>Task</code>.
     *
     * @param progress Usually a value between <code>0.0</code> and <code>1.0</code>.
     * A negative value is used to specify an indefinite progress bar.
     */
    public void setProgress(double progress);

    /**
     * Sets the status message that describes what a <code>Task</code> is currently doing.
     * This method can be called throughout the course of the <code>run</code> method.
     * @param statusMessage String that describe what a Task is currently doing.
     */
    public void setStatusMessage(String statusMessage);
}