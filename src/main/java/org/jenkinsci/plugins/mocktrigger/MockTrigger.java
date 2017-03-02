package org.jenkinsci.plugins.mocktrigger;

import hudson.Extension;
import hudson.model.BuildableItem;
import hudson.model.Item;
import hudson.triggers.Trigger;
import hudson.triggers.TriggerDescriptor;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Created by shebert on 02/03/17.
 */
public class MockTrigger extends Trigger<BuildableItem> {

    @DataBoundConstructor
    public MockTrigger() {
    }

    @Override
    public void start(BuildableItem project, boolean newInstance) {
        super.start(project, newInstance);
        System.out.println("Called");
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Extension
    public static class DescriptorImpl extends TriggerDescriptor {

        @Override public boolean isApplicable(Item item) {
            return true;
        }

    }

}
