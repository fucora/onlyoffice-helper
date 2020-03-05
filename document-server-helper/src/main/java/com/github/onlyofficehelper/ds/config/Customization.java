package com.github.onlyofficehelper.ds.config;

/**
 * <p>
 * The customization section allows to customize the editor interface so that it looked like your other products (if there are any)
 * and change the presence or absence of the additional buttons, links, change logos and editor owner details.
 * </p>
 *
 * @author EricChen 2020/03/05 23:14
 */
public class Customization {
    /**
     * Defines if the Autosave menu option is enabled or disabled.
     * If set to false, only Strict co-editing mode can be selected, as Fast does not work without autosave.
     * Please note that in case you change this option in menu it will be saved to your browser localStorage. The default value is true.
     */
    private boolean autosave;

    /**
     * Defines if the Chat menu button is displayed or hidden; please note that in case you hide the Chat button,
     * the corresponding chat functionality will also be disabled. The default value is true.
     */
    private boolean chat;

    /**
     * Defines if the user can edit and delete only his comments. The default value is false.
     */
    private boolean commentAuthorOnly;

    /**
     * Defines if the Comments menu button is displayed or hidden; please note that in case you hide the Comments button,
     * the corresponding commenting functionality will be available for viewing only,
     * the adding and editing of comments will be unavailable. The default value is true.
     */
    private boolean comments;
    /**
     * Defines if the additional action buttons are displayed in the upper part of the editor window
     * header next to the logo (false) or in the toolbar (true) making the header more compact. The default value is false.
     */
    private boolean compactHeader;

    /**
     * Defines if the top toolbar type displayed is full (false) or compact true. The default value is false.
     */
    private boolean compactToolbar;

    /**
     * Contains the information which will be displayed int the editor About section and visible to all the editor users
     */
    private Customer customer;
    /**
     * Defines settings for the Feedback & Support menu button.
     * Can be either boolean (simply displays or hides the Feedback & Support menu button) or object. In case of object type the following parameters are available:
     */
    private boolean feedback;

    /**
     * Adds the request for the forced file saving to the callback handler when saving the document within the document editing service
     * (e.g. clicking the Save button, etc.). The default value is false.
     */
    private boolean forcesave;

    /**
     * Defines if the Help menu button is displayed or hidden. The default value is true.
     */
    private boolean help;

    /**
     * Defines if the right menu is displayed or hidden on first loading. The default value is false.
     */
    private boolean hideRightMenu;

    /**
     * Changes the image file at the top left corner of the Editor header. The recommended image height is 20 pixels.
     */
    private Logo logo;

    /**
     * Defines if the review changes panel is automatically displayed or hidden when the editor is loaded. The default value is false.
     */
    private boolean showReviewChanges = false;

    /**
     * Defines if the top toolbar tabs are distinctly displayed (when set to false) or only highlighted to see which one is selected (when set to true). The default value is false.
     */
    private boolean toolbarNoTabs = false;

    /**
     * Defines the document display zoom value measured in percent. Can take values larger than 0.
     * For text documents and presentations it is possible to set this parameter to -1
     * (fitting the document to page option) or to -2 (fitting the document page width to the editor page). The default value is 100.
     */
    private Integer zoom = 100;

    /**
     * Defines settings for the Go to Documents menu button and upper right corner button.
     */
    private Goback goback;

    public boolean isAutosave() {
        return autosave;
    }

    public Customization setAutosave(boolean autosave) {
        this.autosave = autosave;
        return this;
    }

    public boolean isChat() {
        return chat;
    }

    public Customization setChat(boolean chat) {
        this.chat = chat;
        return this;
    }

    public boolean isCommentAuthorOnly() {
        return commentAuthorOnly;
    }

    public Customization setCommentAuthorOnly(boolean commentAuthorOnly) {
        this.commentAuthorOnly = commentAuthorOnly;
        return this;
    }

    public boolean isComments() {
        return comments;
    }

    public Customization setComments(boolean comments) {
        this.comments = comments;
        return this;
    }

    public boolean isCompactHeader() {
        return compactHeader;
    }

    public Customization setCompactHeader(boolean compactHeader) {
        this.compactHeader = compactHeader;
        return this;
    }
}
