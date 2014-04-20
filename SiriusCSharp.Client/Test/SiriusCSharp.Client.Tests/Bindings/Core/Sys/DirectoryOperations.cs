using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using TechTalk.SpecFlow;
using Sirius.Client.Core.Sys.Dir;
using NUnit.Framework;

namespace SiriusCSharp.Client.Tests.Bindings.Core.Sys
{
    [Binding]
    public class DirectoryOperations : DirectoryOperationsClient
    {
        public DirectoryOperations()
            : base()
        {
        }
        
        public DirectoryOperations(string endpointConfigurationName) : 
                base(endpointConfigurationName)
        {
        }
        
        public DirectoryOperations(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress)
        {
        }
        
        public bool moveDirectory(string origin, string destination)
        {
            return base.moveDirectory(origin, destination);
        }
        
        public bool moveDirectoryEx(string origin, string destination, bool overwrite)
        {
            return base.moveDirectoryEx(origin, destination, overwrite);
        }
        
        public string[] getContentsEx(string path, bool recursive)
        {
            return base.getContentsEx(path, recursive);
        }
        
        public bool createEx(string path, bool overwrite)
        {
            return base.createEx(path, overwrite);
        }
        
        public bool copyEx(string origin, string destination, bool overwrite)
        {
            return base.copyEx(origin, destination, overwrite);
        }
        
        public bool copy(string origin, string destination)
        {
            return base.copy(origin, destination);
        }

        [Given(@"the ""(.*)"" folder folder doesn't exist")]
        [When(@"delete the ""(.*)"" folder")]
        public new bool delete(string path)
        {
            return base.delete(path);
        }
        
        public new bool exists(string path)
        {
            return base.exists(path);
        }

        [Then(@"I should see the ""(.*)"" folder is {available|missing}")]
        [Then(@"the ""(.*)"" folder is {available|missing}")]
        public void VerifyExists(String path, String available) 
        {
            Assert.AreEqual(available.Equals("available"), exists(path));
        }

        [When(@"I create the ""(.*)"" folder")]
        public new bool create(string path)
        {
            return base.create(path);
        }
        
        public string[] getContents(string path)
        {
            return base.getContents(path);
        }
    }
}
