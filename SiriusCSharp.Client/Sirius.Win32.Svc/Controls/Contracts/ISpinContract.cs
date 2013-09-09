using System;
using System.ServiceModel;
namespace Sirius.Win32.Svc.Controls
{
    [ServiceContract(Namespace = "Sirius.Win32.Svc.Controls", Name="Spin")]
    public interface ISpinContract
    {
        [OperationContract]
        double GetLowerBound([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        double GetPosition([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        string GetText([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        double GetUpperBound([param: MessageParameter(Name = "hwnd")]int hwnd);
        [OperationContract]
        void SetPosition([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "pos")]double pos);
        [OperationContract]
        void SetText([param: MessageParameter(Name = "hwnd")]int hwnd, [param: MessageParameter(Name = "text")]string text);
    }
}
