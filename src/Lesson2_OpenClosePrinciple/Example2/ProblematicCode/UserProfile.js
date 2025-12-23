const UserProfile = ({user}) => {
    const display = () => {
        switch(user.role){
            case 'admin':
                return <AdminView />
            case 'user':
                return <UserView />
            default:
                return <StandardView />
        }
    }
    return <div> {display()} </div>
}