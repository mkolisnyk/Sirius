using System;
using System.ServiceModel;
namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "Sirius.Win32.Svc.Controls", Name="Button")]
    public interface IButtonContract
    {
        [OperationContract]
        void Click([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        bool IsChecked([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        bool IsIntermediate([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        bool IsPressed([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        void SetCheck([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "check")]bool check);
    }
}
