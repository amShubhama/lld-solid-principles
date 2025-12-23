const userProfileSelector = (user) => {
    switch(user.role){
        case 'admin':
            return <AdminView />
        case 'user':
            return <UserView />
        default:
            return <StandardView />
    }
}
export default userProfileSelector;