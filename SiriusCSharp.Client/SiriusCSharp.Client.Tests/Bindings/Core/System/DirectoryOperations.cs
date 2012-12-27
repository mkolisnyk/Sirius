using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using TechTalk.SpecFlow;
using Sirius.Client.Core.Sys.Dir;

namespace SiriusCSharp.Client.Tests.Bindings.Core.System
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
            return copyEx(origin, destination, overwrite);
        }
        
        public bool copy(string origin, string destination)
        {
            return copy(origin, destination);
        }

        [When(@"delete the ""(.*)"" folder")]
        public bool delete(string path)
        {
            return base.delete(path);
        }
        
        public bool exists(string path)
        {
            return base.exists(path);
        }

        [When(@"I create the ""(.*)"" folder")]
        public bool create(string path)
        {
            return base.create(path);
        }
        
        public string[] getContents(string path)
        {
            return base.getContents(path);
        }

        [Then(@"I should see the ""(.*)"" folder is available")]
        public void ThenIShouldSeeTheFolderIsAvailable(string p0)
        {
            ScenarioContext.Current.Pending();
        }

        [Then(@"the ""(.*)"" folder is missing")]
        public void ThenTheFolderIsMissing(string p0)
        {
            ScenarioContext.Current.Pending();
        }

    }
}
