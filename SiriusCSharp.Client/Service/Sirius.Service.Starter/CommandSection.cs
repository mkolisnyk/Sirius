using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Configuration;

namespace Sirius.Service.Starter
{
    public class CommandSection : ConfigurationSection
    {
        [ConfigurationProperty("Commands")]
        public CommandElementCollection Commands
        {
            get { return (CommandElementCollection)this["Commands"]; } 
            set { this["Commands"] = value; } 
        }
    }

    [ConfigurationCollection(typeof(CommandElement))]
    public class CommandElementCollection : ConfigurationElementCollection
    {
        public CommandElement this[int index]
        {
            get { return (CommandElement)BaseGet(index); }
            set
            {
                if (BaseGet(index) != null)
                    BaseRemoveAt(index);

                BaseAdd(index, value);
            }
        }
        protected override ConfigurationElement CreateNewElement()
        {
            return new CommandElement();
        }

        protected override object GetElementKey(ConfigurationElement element)
        {
            return ((CommandElement)element).Name;
        }
    }

    public class CommandElement : ConfigurationElement
    {
        [ConfigurationProperty("Name", IsRequired = true)]
        public String Name
        {
            get { return (String)this["Name"]; }
            set { this["Name"] = value; }
        }
        
        [ConfigurationProperty("Executable", IsRequired = true)]
        public String Executable {
            get {return (String)this["Executable"];} 
            set {this["Executable"]=value;}
        }
        
        [ConfigurationProperty("Host", DefaultValue="localhost", IsRequired = false)]
        public String Host
        {
            get { return (String)this["Host"]; }
            set { this["Host"] = value; }
        }
        
        [ConfigurationProperty("Port", DefaultValue = "31313", IsRequired = true)]
        public String Port
        {
            get { return (String)this["Port"]; }
            set { this["Port"] = value; }
        }

        [ConfigurationProperty("WorkingDir", IsRequired = true)]
        public String WorkingDir
        {
            get { return (String)this["WorkingDir"]; }
            set { this["WorkingDir"] = value; }
        }
    }
}
