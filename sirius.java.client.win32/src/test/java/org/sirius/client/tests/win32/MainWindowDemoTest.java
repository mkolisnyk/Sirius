/**
 * 
 */
package org.sirius.client.tests.win32;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;
import org.sirius.client.win32.Win32Client;
import org.sirius.client.win32.classes.DialogBox;
import org.sirius.client.win32.classes.MainWindow;
import org.sirius.client.win32.classes.Window;
import org.sirius.client.win32.classes.controls.Button;
import org.sirius.client.win32.classes.controls.Edit;
import org.sirius.client.win32.core.constants.IWin32Options;
import org.sirius.client.win32.types.Win32Locator;

/**
 * @author Myk Kolisnyk
 * 
 */
public class MainWindowDemoTest {

    Win32Client client = new Win32Client();

    public class OpenDialog extends DialogBox {

        public Button btnCancel;

        /**
         * @param client
         * @param parent
         * @param locator
         */
        public OpenDialog(Win32Client client, Window parent,
                Win32Locator locator) {
            super(client, parent, locator);
            btnCancel = new Button(this, new Win32Locator("Button", 1));
        }

    }

    public class SaveMessageDialog extends DialogBox {

        public Button btnNO;

        /**
         * @param client
         * @param parent
         * @param locator
         */
        public SaveMessageDialog(Win32Client client, Window parent,
                Win32Locator locator) {
            super(client, parent, locator);
            btnNO = new Button(this, new Win32Locator("Button", 1));
        }

    }

    public class NotepadWindow extends MainWindow {

        public OpenDialog openDialog;
        SaveMessageDialog dSave;
        public Edit       edtText;

        /**
         * @param client
         * @param locator
         */
        public NotepadWindow(Win32Client client, Win32Locator locator) {
            super(client, locator);

            openDialog = new OpenDialog(client, this, new Win32Locator(
                    "#32770(.*)", 0));
            dSave = new SaveMessageDialog(client, this, new Win32Locator(
                    "#32770(.*)", 0));
            edtText = new Edit(this, new Win32Locator("Edit", 0));
        }
    }

    NotepadWindow notepad = new NotepadWindow(client, new Win32Locator(
                                  "Notepad", 0));

    @Ignore
    @Test
    public void moveResize() throws Exception {
        System.out.println("Starting notepad");
        Thread.sleep(5000);
        notepad.start("notepad.exe", "", "");
        System.out.println("Waiting for appear");
        Assert.assertTrue(notepad.exists(IWin32Options.DEFAULT_TIMEOUT));
        System.out.println("OK. It exists!!! Activating...");
        notepad.setActive();
        Thread.sleep(5000);
        System.out.println("Maximizing...");
        notepad.maximize();
        Thread.sleep(5000);
        System.out.println("Minimizing...");
        notepad.minimize();
        Thread.sleep(5000);
        System.out.println("Restore...");
        notepad.restore();
        Thread.sleep(5000);
        System.out.println("Close window");
        notepad.close();
        System.out.println("Waiting for disappear...");
        Assert.assertTrue(notepad.disappears(IWin32Options.DEFAULT_TIMEOUT));
        System.out.println("Success");
    }

    @Ignore
    @Test
    public void menuOperations() throws Exception {
        notepad.start("notepad.exe", "", "");
        System.out.println("Waiting for appear");
        Assert.assertTrue(notepad.exists(IWin32Options.DEFAULT_TIMEOUT));
        notepad.menu().getSubMenu(0).pick(1);
        Assert.assertTrue(notepad.openDialog
                .exists(IWin32Options.DEFAULT_TIMEOUT));
        Assert.assertTrue(notepad.openDialog
                .isVisible(IWin32Options.DEFAULT_TIMEOUT));
        System.out.println("Waiting for exists");
        Assert.assertTrue(notepad.openDialog.btnCancel.exists());
        System.out.println("Waiting for visible");
        Assert.assertTrue(notepad.openDialog.btnCancel.isVisible());
        Assert.assertTrue(notepad.openDialog.btnCancel.isEnabled());
        notepad.openDialog.btnCancel.click();
        Assert.assertTrue(notepad.openDialog
                .disappears(IWin32Options.DEFAULT_TIMEOUT));

        notepad.edtText.typeKeys("Hello World!!!");

        notepad.close();
        Assert.assertTrue(notepad.dSave.exists(IWin32Options.DEFAULT_TIMEOUT));
        Assert.assertTrue(notepad.dSave.btnNO
                .exists(IWin32Options.DEFAULT_TIMEOUT));
        notepad.dSave.btnNO.click();
        Assert.assertTrue(notepad.disappears(IWin32Options.DEFAULT_TIMEOUT));
    }
}
