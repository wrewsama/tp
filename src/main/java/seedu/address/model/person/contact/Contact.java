package seedu.address.model.person.contact;

import java.util.Objects;

/**
 * Contact describes an attribute of a person with a link, value and logo.
 */
public abstract class Contact {

    private final ContactType contactType;
    private final String link;
    private final String value;

    /**
     * Initialize a contact instance
     *
     * @param value Name or information of the contact
     * @param type  Type of contact (telegram, slack, etc.).
     * @param link  Link to be used as hyperlink in UI.
     */
    public Contact(ContactType type, String value, String link) {
        this.contactType = type;
        this.value = value;
        this.link = link;
    }

    public ContactType getContactType() {
        return this.contactType;
    }

    public String getValue() {
        return value;
    }

    public String getLink() {
        return this.link;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Contact)) {
            return false;
        }

        Contact contact = (Contact) other;
        return contactType == contact.contactType
                && Objects.equals(link, contact.link)
                && Objects.equals(value, contact.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactType, link, value);
    }
}
